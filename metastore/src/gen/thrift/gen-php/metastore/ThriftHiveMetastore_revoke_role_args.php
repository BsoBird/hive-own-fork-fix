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

class ThriftHiveMetastore_revoke_role_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'role_name',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'principal_name',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'principal_type',
            'isRequired' => false,
            'type' => TType::I32,
            'class' => '\metastore\PrincipalType',
        ),
    );

    /**
     * @var string
     */
    public $role_name = null;
    /**
     * @var string
     */
    public $principal_name = null;
    /**
     * @var int
     */
    public $principal_type = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['role_name'])) {
                $this->role_name = $vals['role_name'];
            }
            if (isset($vals['principal_name'])) {
                $this->principal_name = $vals['principal_name'];
            }
            if (isset($vals['principal_type'])) {
                $this->principal_type = $vals['principal_type'];
            }
        }
    }

    public function getName()
    {
        return 'ThriftHiveMetastore_revoke_role_args';
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
                        $xfer += $input->readString($this->role_name);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->principal_name);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->principal_type);
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
        $xfer += $output->writeStructBegin('ThriftHiveMetastore_revoke_role_args');
        if ($this->role_name !== null) {
            $xfer += $output->writeFieldBegin('role_name', TType::STRING, 1);
            $xfer += $output->writeString($this->role_name);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->principal_name !== null) {
            $xfer += $output->writeFieldBegin('principal_name', TType::STRING, 2);
            $xfer += $output->writeString($this->principal_name);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->principal_type !== null) {
            $xfer += $output->writeFieldBegin('principal_type', TType::I32, 3);
            $xfer += $output->writeI32($this->principal_type);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
