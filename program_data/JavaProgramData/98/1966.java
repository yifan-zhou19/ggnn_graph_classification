package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] l = new int[1000];
		int t = 0;
		char[][] word = new char[1000][41];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word[i] = tempVar2.charAt(0);
			}
			l[i] = (int)String.valueOf(word[i]).length();
		}
		for (i = 0;i < n - 1;i++)
		{
			t += l[i];
			if (t < 80)
			{
				System.out.printf("%s",word[i]);
				t += 1;
			}
			else if (t == 80)
			{
				System.out.printf("%s\n",word[i]);
				t = 0;
			}
			else
			{
				System.out.print("\n");
				t = 0;
				i -= 1;
			}
			if (t + l[i + 1] <= 80 && t != 0)
			{
				System.out.print(" ");
			}
		}
		System.out.printf("%s",word[i]);
		return 0;
	}




}

