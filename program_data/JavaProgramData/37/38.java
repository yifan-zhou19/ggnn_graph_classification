package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int t;
		int m;
		int n;
		int temp;
		int k = -1;
		int[] a;
		String ans;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		System.in.read();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		ans = (String)calloc(t,(Character.SIZE / Byte.SIZE));
		a = new int[26];
		for (i = 0;i < t;i++)
		{
			n = 1;
			while ((c = System.in.read()) != '\n')
			{
				m = c - 97;
				if (a[m] == 0)
				{
					a[m] = n;
				}
				else
				{
					a[m] = -1;
				}
				n++;
			}
			temp = n;
			for (j = 0;j < 26;j++)
			{
				if (a[j] > 0 && a[j] < temp)
				{
					temp = a[j];
					a[j] = 0;
					k = j;
				}
				else
				{
					a[j] = 0;
				}
			}
			if (k == -1)
			{
				ans = tangible.StringFunctions.changeCharacter(ans, i, '*');
			}
			else
			{
				ans = tangible.StringFunctions.changeCharacter(ans, i, 97 + k);
			}
			k = -1;
		}
		for (i = 0;i < t;i++)
		{
			if (ans.charAt(i) != '*')
			{
				System.out.printf("%c\n",ans.charAt(i));
			}
			else
			{
				System.out.print("no\n");
			}
		}
	}
}

