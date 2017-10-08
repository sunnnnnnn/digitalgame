package digitalgame.model.po;

import java.util.List;

/**
 *
 *  下注的实体类
 *  @author simon
 *  @version 1.0 create 2017-10-08
 *
 */
public class BetInfo {

    public String getBetMan() {
        return betMan;
    }

    public void setBetMan(String betMan) {
        this.betMan = betMan;
    }

    public List<BetItem> getBetList() {
        return betList;
    }

    public void setBetList(List<BetItem> betList) {
        this.betList = betList;
    }

    /**
     * 投注人名称
     */
    private String betMan;

    /**
     * 投注内容
     */
    private List<BetItem> betList;

    class BetItem{
        /**
         * 投注项
         */
        private String betItem;

        /**
         * 投注金额
         */
        private double betMoney = 0.0;

        /**
         * 中奖金额
         */
        private double returnMoney = 0.0;

        public String getBetItem() {
            return betItem;
        }

        public void setBetItem(String betItem) {
            this.betItem = betItem;
        }


        public double getBetMoney() {
            return betMoney;
        }

        public void setBetMoney(double betMoney) {
            this.betMoney = betMoney;
        }

        public double getReturnMoney() {
            return returnMoney;
        }

        public void setReturnMoney(double returnMoney) {
            this.returnMoney = returnMoney;
        }
    }

}