package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String str = "";
		String pstr;
		int[] num = new int[2048];
		int[] temp = new int[100];
		int n;
		int i;
		int j;
		int s1;
		int s2;
		int k = 0;
		int t;
		int max;
		int min;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pnum,*ptemp;
		int pnum;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *ptemp;
		int ptemp;
		str = new Scanner(System.in).nextLine();
		n = str.length();
		pstr = str;
		pnum = num;
		*(pstr.Substring(n) + 1) = ' ';
		for (i = n;i >= 0;i--)
		{
			*(pstr.Substring(i)) = *(pstr.Substring(i) - 1);
		}
		(pstr) = ' ';
		s1 = 0;
		ptemp = temp;
		for (i = 1;i < n + 2;i++)
		{
			if (*(pstr.Substring(i)) == ' ')
			{
				s2 = i;
				*(pnum + i) = s2 - s1 - 1;
				*(ptemp + k) = *(pnum + i);
				s1 = s2;
				k++;
			}
		}
		for (j = 1;j <= k - 1;j++)
		{
			for (i = 0;i < k - j;i++)
			{
				if (*(ptemp + i) > *(ptemp + i + 1))
				{
					t = (ptemp + i + 1);
					*(ptemp + i + 1) = *(ptemp + i);
					*(ptemp + i) = t;
				}
			}
		}
		max = (ptemp + k - 1);
		min = (ptemp);
		for (i = 0;i < n + 2;i++)
		{
			if (*(pnum + i) == max)
			{
				for (j = (i - max);j < i;j++)
				{
					System.out.printf("%c",*(pstr.Substring(j)));
				}
				System.out.print("\n");
				break;
			}
		}
		for (i = 0;i < n + 2;i++)
		{
			if (*(pnum + i) == min)
			{
				for (j = (i - min);j < i;j++)
				{
					System.out.printf("%c",*(pstr.Substring(j)));
				}
				return;
			}
		}
	}
}
