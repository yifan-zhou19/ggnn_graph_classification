public class chain
{
	public String sp = new String(new char[6]);
	public int num;
}

package <missing>;

public class GlobalMembers
{
	public static void bubble(chain[] a, int n)
	{
		int i;
		int j;
		chain temp = new chain();
		for (i = n - 1;i > 0;i--)
		{
			for (j = 0;j <= i;j++)
			{
				if (a[j].num < a[j + 1].num)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=a[j];
					temp.copyFrom(a[j]);
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
	public static int Main()
	{
		chain[] a = tangible.Arrays.initializeWithDefaultchainInstances(500);
		int i;
		int j;
		int k;
		String s = new String(new char[501]);
		String c = new String(new char[6]);
		char c1;
		for (i = 0;i <= 500;i++)
		{
			a[i].num = 1;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		for (i = 0;i <= s.length() - k;i++)
		{
			for (j = 0;j < k;j++)
			{
				c = tangible.StringFunctions.changeCharacter(c, j, s.charAt(i + j));
			}
			c = tangible.StringFunctions.changeCharacter(c, j, '\0');
			a[i].sp = c;

		}
		for (i = 0;i < s.length() - k;i++)
		{
			for (j = i + 1;j <= s.length() - k;j++)
			{
				if (strcmp(a[i].sp,a[j].sp) == 0)
				{
					a[i].num++;

				}
			}
		}
		bubble(a, s.length() - k);
		if (a[0].num > 1)
		{
			System.out.printf("%d\n",a[0].num);
			System.out.printf("%s\n",a[0].sp);
			for (i = 1;i <= s.length() - k;i++)
			{
				if (a[i].num == a[0].num && (strcmp(a[i].sp,a[i - 1].sp) != 0))
				{
					System.out.printf("%s\n",a[i].sp);
				}
			}
		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}
}

