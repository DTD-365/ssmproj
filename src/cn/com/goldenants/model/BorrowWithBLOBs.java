package cn.com.goldenants.model;

public class BorrowWithBLOBs extends Borrow {
    private String descp;

    private String pawn;

    public String getDescp() {
        return descp;
    }

    public void setDescp(String descp) {
        this.descp = descp == null ? null : descp.trim();
    }

    public String getPawn() {
        return pawn;
    }

    public void setPawn(String pawn) {
        this.pawn = pawn == null ? null : pawn.trim();
    }
}