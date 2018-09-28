package <missing>;

public class GlobalMembers
{
	public static String dui_lie = new String(new char[100]);
	public static char zuo;
	public static char you;
	public static int zuobian; //??????
	public static int youbian;
	public static int changdu;

	public static void qian_shou(int zuobian) //????
	{
		for (youbian = zuobian + 1;youbian < changdu;youbian++)
		{
								  if (dui_lie.charAt(youbian) == zuo || dui_lie.charAt(youbian) == you)
								  {
								  break;
								  }
		} //???????????????????????
		if (dui_lie.charAt(youbian) == you)
		{
								 dui_lie = tangible.StringFunctions.changeCharacter(dui_lie, zuobian, '*');
								 dui_lie = tangible.StringFunctions.changeCharacter(dui_lie, youbian, '*');
								 System.out.print(zuobian);
								 System.out.print(" ");
								 System.out.print(youbian);
								 System.out.print("\n");
		} //????????????????????????
		else
		{
			zuobian = youbian;
			qian_shou(zuobian);
		} //?????????????????????????????
	}



	public static int Main()
	{

		int i;
		dui_lie = ConsoleInput.readToWhiteSpace(true).charAt(0);
		changdu = dui_lie.length();
		zuo = dui_lie.charAt(0);
		you = dui_lie.charAt(changdu - 1); //????????????
		for (i = 1;i <= changdu / 2;i++)
		{
							zuobian = 0; //???????????????
							qian_shou(zuobian);
		} //???????????
	return 0;
	}



}

