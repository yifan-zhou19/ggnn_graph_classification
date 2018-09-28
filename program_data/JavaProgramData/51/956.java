package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 's', so pointers on this parameter are left unchanged:
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'c', so pointers on this parameter are left unchanged:
	public static void copy(char * s, char * c, int n)
	{
		int i;
		for (i = 0; i < n; i++)
		{
			*s = c;
			s = s.Substring(1);
			c = c.Substring(1);
		}
	}

	public static void Main()
	{
		final String str = "";
		final String s = "";
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str;
		String q;
		int n;
		int i;
		int j;
		int max = 0;
		int[] a = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		str = new Scanner(System.in).nextLine();
		for (i = 0; * (p) != '\0'; p++,i++)
		{
			copy(s.charAt(i), p, n);
		}
		n = i;
		for (i = j = 0; i < n; i++)
		{
			for (j = i; j < n; j++)
			{
				if (strcmp(s.charAt(i), s.charAt(j)) == 0)
				{
					a[i]++;
				}
			}
		}
		for (i = 0; i < n; i++)
		{
			max = (max < a[i])?a[i]:max;
		}
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",max);
			for (i = 0; i < n; i++)
			{
				if (max == a[i])
				{
					System.out.printf("%s\n",s.charAt(i));
				}
			}
		}
	}


}

