package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String p1;
		String p2;
		int m;
		int n;
		int i;
		int j;
		int k;
		int t;
		int max;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p2 = (String)malloc(3 * (Character.SIZE / Byte.SIZE));
		while (scanf("%s %s",p1,p2) != EOF)
		{
			t = 0;
			n = p1.length();
			max = p1;
			for (i = 0;i < n;i++)
			{
				if (*(p1.Substring(i)) > max)
				{
					max = (p1.Substring(i));
					t = i;
				}
			}
				for (i = n - 1;i >= t + 1;i--)
				{
					*(p1.Substring(i) + 3) = *(p1.Substring(i));
				}
				*(p1.Substring(n) - 1 + 4) = '\0';
				for (i = 0;i < 3;i++)
				{
				*(p1.Substring(t) + 1 + i) = *(p2.Substring(i));
				}
				System.out.printf("%s\n",p1);
		}

	}

}
