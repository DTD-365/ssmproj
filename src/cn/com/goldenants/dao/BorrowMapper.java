package cn.com.goldenants.dao;

import cn.com.goldenants.model.Borrow;
import cn.com.goldenants.model.BorrowExample;
import cn.com.goldenants.model.BorrowWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BorrowMapper {
    int countByExample(BorrowExample example);

    int deleteByExample(BorrowExample example);

    int deleteByPrimaryKey(String borrowUuid);

    int insert(BorrowWithBLOBs record);

    int insertSelective(BorrowWithBLOBs record);

    List<BorrowWithBLOBs> selectByExampleWithBLOBs(BorrowExample example);

    List<Borrow> selectByExample(BorrowExample example);

    BorrowWithBLOBs selectByPrimaryKey(String borrowUuid);

    int updateByExampleSelective(@Param("record") BorrowWithBLOBs record, @Param("example") BorrowExample example);

    int updateByExampleWithBLOBs(@Param("record") BorrowWithBLOBs record, @Param("example") BorrowExample example);

    int updateByExample(@Param("record") Borrow record, @Param("example") BorrowExample example);

    int updateByPrimaryKeySelective(BorrowWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BorrowWithBLOBs record);

    int updateByPrimaryKey(Borrow record);
}