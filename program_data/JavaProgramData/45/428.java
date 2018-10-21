package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[50]);
		String str2 = new String(new char[50]);
		char[][] c = new char[50][50];
		String pc = new String(new char[50]);
		String p1;
		String p2;
		int i;
		int j = -1;
		int k;
		int s1;
		int s2;
		int n;
		int[] a = new int[50];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}
		s1 = str1.length();
		s2 = str2.length();
		pc = c;
		p1 = str1;
		p2 = str2;
		b = a;
		for (i = 0;i < s2;i++)
		{
			if (*(p2.Substring(i)) == p1)
			{
				if (i <= s2 - s1)
				{
					j++;
					for (k = 0;k < s1;k++)
					{
						*(*(pc.Substring(j)) + k) = *(p2.Substring(k) + i);
					}
					*(*(pc.Substring(j)) + k) = '\0';
					*(b + j) = i;
				}
			}
		}
		n = j + 1;
		for (i = 0;i < n;i++)
		{
			if (strcmp(str1,*(pc.Substring(i))) == 0)
			{
			 System.out.printf("%d\n",*(b + i));
			}
			break;
		}
	}
}

