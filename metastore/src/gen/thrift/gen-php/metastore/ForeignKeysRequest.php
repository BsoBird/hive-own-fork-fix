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

class ForeignKeysRequest
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'parent_db_name',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'parent_tbl_name',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'foreign_db_name',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        4 => array(
            'var' => 'foreign_tbl_name',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var string
     */
    public $parent_db_name = null;
    /**
     * @var string
     */
    public $parent_tbl_name = null;
    /**
     * @var string
     */
    public $foreign_db_name = null;
    /**
     * @var string
     */
    public $foreign_tbl_name = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['parent_db_name'])) {
                $this->parent_db_name = $vals['parent_db_name'];
            }
            if (isset($vals['parent_tbl_name'])) {
                $this->parent_tbl_name = $vals['parent_tbl_name'];
            }
            if (isset($vals['foreign_db_name'])) {
                $this->foreign_db_name = $vals['foreign_db_name'];
            }
            if (isset($vals['foreign_tbl_name'])) {
                $this->foreign_tbl_name = $vals['foreign_tbl_name'];
            }
        }
    }

    public function getName()
    {
        return 'ForeignKeysRequest';
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
                        $xfer += $input->readString($this->parent_db_name);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->parent_tbl_name);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->foreign_db_name);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->foreign_tbl_name);
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
        $xfer += $output->writeStructBegin('ForeignKeysRequest');
        if ($this->parent_db_name !== null) {
            $xfer += $output->writeFieldBegin('parent_db_name', TType::STRING, 1);
            $xfer += $output->writeString($this->parent_db_name);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->parent_tbl_name !== null) {
            $xfer += $output->writeFieldBegin('parent_tbl_name', TType::STRING, 2);
            $xfer += $output->writeString($this->parent_tbl_name);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->foreign_db_name !== null) {
            $xfer += $output->writeFieldBegin('foreign_db_name', TType::STRING, 3);
            $xfer += $output->writeString($this->foreign_db_name);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->foreign_tbl_name !== null) {
            $xfer += $output->writeFieldBegin('foreign_tbl_name', TType::STRING, 4);
            $xfer += $output->writeString($this->foreign_tbl_name);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
