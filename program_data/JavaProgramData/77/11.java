public class student
{
	public int boy;
	public int girl;
}

package <missing>;

public class GlobalMembers
{
	public static student[] out = tangible.Arrays.initializeWithDefaultstudentInstances(PI);
	public static student tmp = new student();
	public static int len;
	public static int k = 0;
	public static String s = new String(new char[PI]);
	public static char b;
	public static char g;

	public static void output()
	{
		int i;
		int j;
		for (i = 0;i < k;i++)
		{
			for (j = i + 1;j < k;j++)
			{
				if (out[i].girl > out[j].girl)
				{
					tmp.boy = out[i].boy;
					tmp.girl = out[i].girl;
					out[i].boy = out[j].boy;
					out[i].girl = out[j].girl;
					out[j].boy = tmp.boy;
					out[j].girl = tmp.girl;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d %d\n",out[i].boy,out[i].girl);
		}
	}


	public static void outing(int x)
	{
		int l;
		int r;
		l = 1;
		r = 0;
		int i;
		int j;
		j = 0;
		for (i = 0;i < len;i++)
		{
			if (s.charAt(i) != '0')
			{
				j++;
			}
		}
		if (j == 0)
		{
			output();
		}
		else
		{
		for (i = x + 1;i < len;i++)
		{
			if (s.charAt(i) == b)
			{
				l++;
			}
			if (s.charAt(i) == g)
			{
				r++;
				if (r == l)
				{
					s = tangible.StringFunctions.changeCharacter(s, x, '0');
					s = tangible.StringFunctions.changeCharacter(s, i, '0');
					out[k].boy = x;
					out[k].girl = i;
	//				printf("%d %d\n",out[k].boy,out[k].girl);
					k++;
					break;
				}
			}
		}
		outing(x + 1);
		}

	}

	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		int i;
		len = s.length();
		b = s.charAt(0);
		for (i = 0;i < len;i++)
		{
			if (s.charAt(i) != b)
			{
				g = s.charAt(i);
				break;
			}
		}
		outing(0);
		return 0;
	}
}

