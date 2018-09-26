package <missing>;

public class GlobalMembers
{
	//****************************************
	//*?????13                    **
	//*?????? 1100012920              **
	//*???2011.11.2                     **
	//****************************************
	public static int Main()
	{
		String num = new String(new char[100]);
		String ans = new String(new char[100]);
		int n;
		int i;
		int flag = 1;
		int a = 0;
		cin.get(num, 100);
		n = num.length();
		for (i = 0; i < n; i++)
		{
			ans = tangible.StringFunctions.changeCharacter(ans, i, (a * 10 + (num.charAt(i) - '0')) / 13);
			a = (a * 10 + (num.charAt(i) - '0')) % 13;
		}
		for (i = 0; i < n; i++)
		{
			if (n != 2)
			{
			   if (n != 1 && flag == 1 && (ans.charAt(i) - '0' + 48) == 0)
			   {
					continue;
			   }
			   else if ((ans.charAt(i) - '0' + 48) != 0 || flag != 1 || n == 1)
			   {
					flag = 0;
					System.out.print(ans.charAt(i) - '0' + 48);
			   }
			}
		}
		if (n == 2)
		{
		   if ((ans.charAt(0) - '0' + 48) != 0)
		   {
			   System.out.print(ans.charAt(0) - '0' + 48);
		   }
		   System.out.print(ans.charAt(1) - '0' + 48);
		}
		System.out.print("\n");
		System.out.print(a);
		return 0;
	}

}

