package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[1000]);
	public static char[][] s = new char[1000][1000];
	public static int[] num = new int[1000];
	public static void Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		int len = str.length();
		int q = 0;
		for (i = 0;i < len;i++)
		{
			if (len - i < n)
			{
				break;
			}
			int boo = 0;
			int p = 0;
			int m;
			for (j = i;j < i + n;j++)
			{
				s[q][p++] = str.charAt(j);
			}
			s[q][p] = '\0';
			for (m = 0;m < q;m++)
			{
				if (strcmp(s[m],s[q]) == 0)
				{

					boo = 1;
					break;
				}
			}
			if (boo == 1)
			{
				continue;
			}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * ptr;
			ptr = tangible.StringFunctions.strStr(str,s[q]);
			if (ptr == null)
			{
				continue;
			}
			else
			{
				while (ptr != null)
				{
					ptr += 1;
					ptr = tangible.StringFunctions.strStr(ptr,s[q]);
					num[q]++;
				}
			}
			q++;
		}

		int max = 0;
		for (i = 0;i < len + 2;i++)
		{
			if (num[i] > max)
			{
				max = num[i];
			}
		}
		if (max > 1)
		{
			System.out.printf("%d\n",max);
			for (i = 0;i < len + 2;i++)
			{
				if (num[i] == max)
				{
					System.out.printf("%s\n",s[i]);
				}
			}
		}
		else
		{
			System.out.print("NO\n");
		}
	}


}

