public class Letter
{
	public char letter;
	public int time;
}

package <missing>;

public class GlobalMembers
{
	public static Letter[] Z = tangible.Arrays.initializeWithDefaultLetterInstances(100);
	public static Letter S = new Letter();
	public static int Main()
	{
		String str = new String(new char[300]);
		int i;
		int j = 0;
		int t;
		int n;
		int m = 0;
		int ge;
		str = new Scanner(System.in).nextLine();
		n = str.length();
		for (i = 0;i < 100;i++)
		{
			Z[i].time = 0;
		}
		for (i = 0;i < n;i++)
		{
			for (t = 0;t < 100;t++)
			{
				if (str.charAt(i) == Z[t].letter)
				{
					Z[t].time++;
					m++;
					break;
				}
			}
			if (m == 0 && (((str.charAt(i) > 64) && (str.charAt(i) < 91)) || ((str.charAt(i)>96) && (str.charAt(i) < 123))))
			{
				Z[j].letter = str.charAt(i);
				Z[j].time++;
				j++;
			}
			else
			{
				m = 0;
			}
		}
		ge = j - 1;
		if (ge == -1)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;i < ge-1;i++)
			{
				for (j = 0;j < ge - i;j++)
				{
					if (Z[j].letter > Z[j + 1].letter)
					{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: S=Z[j];
						S.copyFrom(Z[j]);
						Z[j] = Z[j + 1];
						Z[j + 1] = S;
					}
				}
			}
			for (i = 0;i <= ge;i++)
			{
				System.out.printf("%c=%d\n",Z[i].letter,Z[i].time);
			}
		}
		return 0;
	}
}

