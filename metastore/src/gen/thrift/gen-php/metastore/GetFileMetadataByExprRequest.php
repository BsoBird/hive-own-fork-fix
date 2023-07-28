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

class GetFileMetadataByExprRequest
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'fileIds',
            'isRequired' => true,
            'type' => TType::LST,
            'etype' => TType::I64,
            'elem' => array(
                'type' => TType::I64,
                ),
        ),
        2 => array(
            'var' => 'expr',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'doGetFooters',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        4 => array(
            'var' => 'type',
            'isRequired' => false,
            'type' => TType::I32,
            'class' => '\metastore\FileMetadataExprType',
        ),
    );

    /**
     * @var int[]
     */
    public $fileIds = null;
    /**
     * @var string
     */
    public $expr = null;
    /**
     * @var bool
     */
    public $doGetFooters = null;
    /**
     * @var int
     */
    public $type = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['fileIds'])) {
                $this->fileIds = $vals['fileIds'];
            }
            if (isset($vals['expr'])) {
                $this->expr = $vals['expr'];
            }
            if (isset($vals['doGetFooters'])) {
                $this->doGetFooters = $vals['doGetFooters'];
            }
            if (isset($vals['type'])) {
                $this->type = $vals['type'];
            }
        }
    }

    public function getName()
    {
        return 'GetFileMetadataByExprRequest';
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
                        $this->fileIds = array();
                        $_size553 = 0;
                        $_etype556 = 0;
                        $xfer += $input->readListBegin($_etype556, $_size553);
                        for ($_i557 = 0; $_i557 < $_size553; ++$_i557) {
                            $elem558 = null;
                            $xfer += $input->readI64($elem558);
                            $this->fileIds []= $elem558;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->expr);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->doGetFooters);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->type);
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
        $xfer += $output->writeStructBegin('GetFileMetadataByExprRequest');
        if ($this->fileIds !== null) {
            if (!is_array($this->fileIds)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('fileIds', TType::LST, 1);
            $output->writeListBegin(TType::I64, count($this->fileIds));
            foreach ($this->fileIds as $iter559) {
                $xfer += $output->writeI64($iter559);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->expr !== null) {
            $xfer += $output->writeFieldBegin('expr', TType::STRING, 2);
            $xfer += $output->writeString($this->expr);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->doGetFooters !== null) {
            $xfer += $output->writeFieldBegin('doGetFooters', TType::BOOL, 3);
            $xfer += $output->writeBool($this->doGetFooters);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->type !== null) {
            $xfer += $output->writeFieldBegin('type', TType::I32, 4);
            $xfer += $output->writeI32($this->type);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
