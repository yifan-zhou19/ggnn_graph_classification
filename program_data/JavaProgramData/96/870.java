package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[110]);
		char c;
		int i;
		int j;
		int k;
		int q = 0;
		int sum = 0;
		int[] ans1 = new int[110];
		int ans2;
		while (c = System.in.read())
		{
		   if (c == '\n')
		   {
		   break;
		   }
		   if (c != '\n')
		   {
					  a = tangible.StringFunctions.changeCharacter(a, q, c);
					  q++;
		   }
		}
		for (i = 0;i < q;i++)
		{
			sum = sum * 10 + a.charAt(i) - 48;
			if (sum < 13)
			{
			ans1[i] = 0;
			}
			if (sum >= 13)
			{
			   ans1[i] = sum / 13;
			   sum = sum % 13;
			}
		}
		for (i = 0;i < q;i++)
		{
		   if (ans1[i] != 0)
		   {
			   for (j = i;j < q;j++)
			   {
			   System.out.print(ans1[j]);
			   }
			   System.out.print("\n");
			   System.out.print(sum);
			   break;
		   }
		   if (ans1[i] == 0 && i == q - 1)
		   {
			 System.out.print("0");
			 System.out.print("\n");
			 System.out.print(sum);
		   }
		}
		return 0;
	}

}

