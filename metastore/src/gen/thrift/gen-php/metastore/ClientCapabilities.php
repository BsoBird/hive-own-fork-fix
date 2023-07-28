<?php
namespace metastore;

/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

class ClientCapabilities
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'values',
            'isRequired' => true,
            'type' => TType::LST,
            'etype' => TType::I32,
            'elem' => array(
                'type' => TType::I32,
                'class' => '\metastore\ClientCapability',
                ),
        ),
    );

    /**
     * @var int[]
     */
    public $values = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['values'])) {
                $this->values = $vals['values'];
            }
        }
    }

    public function getName()
    {
        return 'ClientCapabilities';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::LST) {
                        $this->values = array();
                        $_size604 = 0;
                        $_etype607 = 0;
                        $xfer += $input->readListBegin($_etype607, $_size604);
                        for ($_i608 = 0; $_i608 < $_size604; ++$_i608) {
                            $elem609 = null;
                            $xfer += $input->readI32($elem609);
                            $this->values []= $elem609;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('ClientCapabilities');
        if ($this->values !== null) {
            if (!is_array($this->values)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('values', TType::LST, 1);
            $output->writeListBegin(TType::I32, count($this->values));
            foreach ($this->values as $iter610) {
                $xfer += $output->writeI32($iter610);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
