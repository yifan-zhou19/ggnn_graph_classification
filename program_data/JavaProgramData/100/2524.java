public class abb
{
	public char c;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		String s = new String(new char[400]);
		abb[] aa = tangible.Arrays.initializeWithDefaultabbInstances(60);
		abb a = new abb();

		for (i = 0;i < 60;i++)
		{
			aa[i].c = '0';
			aa[i].sum = 0;
		}

		s = new Scanner(System.in).nextLine();
		l = s.length();
		j = 0;

		for (i = 0;i < l;i++)
		{
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
			{
				for (k = 0;k < j;k++)
				{
					if (s.charAt(i) == aa[k].c)
					{
						aa[k].sum++;
					break;
					}
				}

					if (k == j)
					{
					aa[j].c = s.charAt(i);
					aa[j].sum++;
					j++;
					}
			}

			else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
				for (k = 0;k < j;k++)
				{
					if (s.charAt(i) == aa[k].c)
					{
						aa[k].sum++;
					break;
					}
				}

					if (k == j)
					{
					aa[j].c = s.charAt(i);
					aa[j].sum++;
					j++;
					}
			}
		}

			if (j == 0)
			{
				System.out.print("No");
			}
			else if (j == 1)
			{
				System.out.printf("%c=%d",aa[0].c,aa[0].sum);
			}
			else
			{

			for (i = 1;i < j;i++)
			{
				for (k = 0;k < j - i;k++)
				{
					if (aa[k].c > aa[k + 1].c)
					{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: a=aa[k];
						a.copyFrom(aa[k]);
					aa[k] = aa[k + 1];
					aa[k + 1] = a;
					}
				}
			}


					for (i = 0;i < j;i++)
					{
						System.out.printf("%c=%d\n",aa[i].c,aa[i].sum);
					}
			}

			return 0;
	}




}

