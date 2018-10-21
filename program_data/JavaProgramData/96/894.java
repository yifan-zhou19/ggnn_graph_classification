package <missing>;

public class GlobalMembers
{
	public static int lenth;
	public static int[] num = new int[110];
	public static void function(int i)
	{
		if (i <= lenth - 1)
		{
	   ans[i] = (10 * num[i] + num[i + 1]) / 13;
	   num[i + 1] = (10 * num[i] + num[i + 1]) % 13;
	   function(i + 1);
		}
	   else
	   {
		   if (ans[0] != 0)
		   {
			   System.out.print(ans[0]);
		   }
		for (i = 1;i <= lenth - 1;i++)
		{
			System.out.print(ans[i]);
		}
		System.out.print("\n");
		yu = num[i];
		System.out.print(yu);
	   }

	}
	public static int Main()
	{
		String a = new String(new char[110]);
		char s;
		int i = 0;
		int j = 0;
		int special;
		while ((s = System.in.read()) != '\n')
		{
			a = tangible.StringFunctions.changeCharacter(a, i, s);
			i++;
		}
		lenth = i - 1;
		for (i = 0;i <= lenth;i++)
		{
			num[i] = a.charAt(i) - '0';
		}
		//??????int??
		if (lenth < 1)
		{
				special = num[0];
		System.out.print(special / 13);
		System.out.print("\n");
		System.out.print(special % 13);
		}
		else if (lenth == 1)
		{
				special = num[0] * 10 + num[1];
		System.out.print(special / 13);
		System.out.print("\n");
		System.out.print(special % 13);
		}
		else
		{
		function(0);
		}



		return 0;
	}
	public static int[] ans = new int[110]; //???lenth-1
	public static int yu;


}

