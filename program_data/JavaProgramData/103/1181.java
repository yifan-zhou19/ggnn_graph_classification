package <missing>;

public class GlobalMembers
{
	//??? ???????? ?????   

	public static int Main()
	{
	String str = new String(new char[1001]);
	int i;
	int j;
	int k;
	int time = 1;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		str = tempVar.charAt(0);
	}
	if (str.charAt(0) >= 97)
	{
	str.charAt(0) -= 32;
	}
	for (i = 1;str.charAt(i);i++)
	{
		 if (str.charAt(i) >= 97)
		 {
		 str.charAt(i) -= 32;
		 }
		 if (str.charAt(i) == str.charAt(i - 1))
		 {
			 time++;
		 }
		 else
		 {
			 System.out.printf("(%c,%d)",str.charAt(i - 1),time);
			 time = 1;
		 }
	}
	System.out.printf("(%c,%d)",str.charAt(i - 1),time);

	return 0;
	}
}

