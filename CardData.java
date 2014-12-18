package DRAKO.Data;


public interface CardData{
	int[] HU={1,2,2,2,3,3,3,3,3,4,4,4,4,5,5,6,6,7,7,7,7,7,8,9,9,9,9,10,10,10,10,11,11,12,13,14,15,16};
	//int[] HU={5,7,4,16,14,3,3,3,3,4,4,4,4,5,5,6,6,7,7,7,7,7,8,9,9,9,9,10,10,10,10,11,11,12,13,14,15,16};
	int[] DR={17,17,17,18,18,18,18,18,18,18,19,19,19,19,19,19,20,25,21,21,26,26,26,22,22,22,22,22,23,23,24,24,24,27,27,27,27,27};
	//int[] DR={22,19,27,22,23,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22};
	int[][] CARD={
		{2,1,20},  //1砍1 *1           ==1
		{2,2,20},  //砍2 *3           ==2
		{3,1,10,20},  //砍1+走1 *5           ==3
		{2,3,20},  //雙砍1*4           ==4
		{2,13,20},  //雙走1 *2           ==5
		{3,10,18,20},//6  //走1+擋  *2           ==6
		{3,11,18,20},  //走2+擋 *5           ==7
		{3,13,14,20},  //雙走1+網 *1           ==8
		{3,13,18,20},  //雙走1+擋 *4           ==9
		{2,18,20},  //擋*4           ==10
		{2,4,20},//11  //射1*2           ==11
		{3,4,1,20},  //射1+砍1 *1           ==12
		{3,4,13,20},  //射1+雙走1 *1           ==13
		{3,4,11,20},  //射1+走2 *1           ==14
		{2,14,20},  //網*1           ==15
		{3,14,18,20},//16  //網+擋*1           ==16
		{2,7,20},  //咬3 *3           ==17
		{3,5,11,20},  //咬1+走2 *7           ==18
		{3,6,10,20},  //咬2+走1 *6           ==19
		{3,6,11,20},  //咬2+走2 *1           ==20
		{2,11,20},//21  //走2 *2           ==21
		{2,17,20},  //飛 *5           ==22
		{2,8,20},  //噴1 *2           ==23
		{2,9,20},  //噴2 *3           ==24
		{2,10,20},  // 走1                   ==25
		{3,10,18,20},  // 走1+擋                ==26
		{2,18,20},//擋                            ==27
		//系統自訂----------------------------
		{2,15,20},  //解網
		{2,16,20},  //狂爆
		{3,22,24,20},//30 抽牌 
	};
	int[][] STEP_1={
		{4,4,5,6,7},  //1 砍1
		{4,4,5,6,7},  //砍2
		{4,4,5,6,7},  //雙砍
		{4,4,5,6,7},  //射1
		{3,1,2,3},  //咬1
		{3,1,2,3},  //6 咬2
		{3,1,2,3},  //咬3
		{0},  //噴1
		{0},  //噴2
		{3,1,2,3},  //走1
		{3,1,2,3},  //11 走2
		{2,12,13},  //選種族
		{3,1,2,3},  //雙走
		{0},  //網
		{0},  //解網
		{0},  //16狂爆
		{0},  //飛
		{0},  //擋
		{3,8,9,10},  //猜拳
		{0},  //取消
		{0},  //選矮人位置
		{0},  //抽牌
		{0}  //棄牌
	};
	int[] round={1,1,1,1,1,/**/1,1,1,1,1,/**/1,0,1,1,1,/**/-1,1,0,0,0,/**/1,1,1,0,0};
}
/*
物品{
	1=弓
	2=狂
	3=網
	4=翅
	5=腳
	6=嘴
	7=龍
	8=剪刀
	9=石頭
	10=布
	11=方向
	12=龍族
	13=矮人族
	20=取消
}
action{
	1=砍1
	2=砍2
	3=雙砍
	4=射1
	5=咬1
	6=咬2
	7=咬3
	8=噴1
	9=噴2
	10=走1
	11=走2
	12=選種族
	13=雙走
	14=網
	15=解網
	16=狂爆
	17=飛
	18=擋
	19=猜拳
	20=取消
	21=選矮人位置
	22=抽牌
	23=棄牌
	24=跳過
	25=game over
	p{
		砍1.2  龍部位
		走1.2  矮人  位置
		雙砍  龍部位1 龍部位2
		雙走  矮人1 位置1 矮人2 位置2
		網
		擋
		射
		爆發
	}
	D{
		飛 位置
		走1.2 位置
		咬1.2.3 矮人
		噴火1.2 方向
		解網
	}
	ALL{
		猜拳 三選1
		取消
	}
}
people{
	砍1 *1           ==1
	砍2 *3           ==2
	砍1+走1 *5           ==3

	雙砍1*4           ==4


	雙走1 *2           ==5  1
	
	走1+擋  *2           ==6
	走2+擋 *5           ==7

	雙走1+網 *1           ==8
	雙走1+擋 *4           ==9

	擋*4           ==10

	射1*2           ==11
	射1+砍1 *1           ==12
	射1+雙走1 *1           ==13
	射1+走2 *1           ==14

	網*1           ==15
	網+擋*1           ==16
}
D{
	咬3 *3           ==17
	咬1+走2 *7           ==18
	咬2+走1 *6           ==19
	咬2+走2 *1           ==20

	走1 *1           ==25
	走2 *2           ==21
	走1+擋*3           ==26

	飛 *5           ==22

	噴1 *2           ==23
	噴2 *3           ==24

	擋*5           ==27
}

P{
	弓 *5
	狂 *6
	網 *4
}
D{
	*4
	翅*2
	腳*3
	火*2
}
*/