package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 1;
		int[] s = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s[1] = Integer.parseInt(tempVar);
		}
		if (s[1] == 1)
		{
			System.out.print("End");
		}
		else
		{
			while (s[i] != 1)
			{
				 if (s[i] % 2 == 0)
				 {
					 s[i + 1] = s[i] / 2;
					System.out.printf("%d/2=%d\n",s[i],s[i + 1]);
				 }
				 else
				 {
					 s[i + 1] = s[i] * 3 + 1;
					 System.out.printf("%d*3+1=%d\n",s[i],s[i + 1]);
				 }
				 i++;
			}
			System.out.print("End");
		}
		return 0;
	}

}

