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

class ThriftHiveMetastore_alter_index_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'dbname',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'base_tbl_name',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'idx_name',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        4 => array(
            'var' => 'new_idx',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\metastore\Index',
        ),
    );

    /**
     * @var string
     */
    public $dbname = null;
    /**
     * @var string
     */
    public $base_tbl_name = null;
    /**
     * @var string
     */
    public $idx_name = null;
    /**
     * @var \metastore\Index
     */
    public $new_idx = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['dbname'])) {
                $this->dbname = $vals['dbname'];
            }
            if (isset($vals['base_tbl_name'])) {
                $this->base_tbl_name = $vals['base_tbl_name'];
            }
            if (isset($vals['idx_name'])) {
                $this->idx_name = $vals['idx_name'];
            }
            if (isset($vals['new_idx'])) {
                $this->new_idx = $vals['new_idx'];
            }
        }
    }

    public function getName()
    {
        return 'ThriftHiveMetastore_alter_index_args';
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
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->dbname);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->base_tbl_name);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->idx_name);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::STRUCT) {
                        $this->new_idx = new \metastore\Index();
                        $xfer += $this->new_idx->read($input);
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
        $xfer += $output->writeStructBegin('ThriftHiveMetastore_alter_index_args');
        if ($this->dbname !== null) {
            $xfer += $output->writeFieldBegin('dbname', TType::STRING, 1);
            $xfer += $output->writeString($this->dbname);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->base_tbl_name !== null) {
            $xfer += $output->writeFieldBegin('base_tbl_name', TType::STRING, 2);
            $xfer += $output->writeString($this->base_tbl_name);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->idx_name !== null) {
            $xfer += $output->writeFieldBegin('idx_name', TType::STRING, 3);
            $xfer += $output->writeString($this->idx_name);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->new_idx !== null) {
            if (!is_object($this->new_idx)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('new_idx', TType::STRUCT, 4);
            $xfer += $this->new_idx->write($output);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
