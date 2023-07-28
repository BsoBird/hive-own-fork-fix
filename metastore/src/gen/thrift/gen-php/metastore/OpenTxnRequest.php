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

class OpenTxnRequest
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'num_txns',
            'isRequired' => true,
            'type' => TType::I32,
        ),
        2 => array(
            'var' => 'user',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'hostname',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        4 => array(
            'var' => 'agentInfo',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var int
     */
    public $num_txns = null;
    /**
     * @var string
     */
    public $user = null;
    /**
     * @var string
     */
    public $hostname = null;
    /**
     * @var string
     */
    public $agentInfo = "Unknown";

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['num_txns'])) {
                $this->num_txns = $vals['num_txns'];
            }
            if (isset($vals['user'])) {
                $this->user = $vals['user'];
            }
            if (isset($vals['hostname'])) {
                $this->hostname = $vals['hostname'];
            }
            if (isset($vals['agentInfo'])) {
                $this->agentInfo = $vals['agentInfo'];
            }
        }
    }

    public function getName()
    {
        return 'OpenTxnRequest';
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
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->num_txns);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->user);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->hostname);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->agentInfo);
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
        $xfer += $output->writeStructBegin('OpenTxnRequest');
        if ($this->num_txns !== null) {
            $xfer += $output->writeFieldBegin('num_txns', TType::I32, 1);
            $xfer += $output->writeI32($this->num_txns);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->user !== null) {
            $xfer += $output->writeFieldBegin('user', TType::STRING, 2);
            $xfer += $output->writeString($this->user);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->hostname !== null) {
            $xfer += $output->writeFieldBegin('hostname', TType::STRING, 3);
            $xfer += $output->writeString($this->hostname);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->agentInfo !== null) {
            $xfer += $output->writeFieldBegin('agentInfo', TType::STRING, 4);
            $xfer += $output->writeString($this->agentInfo);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
