package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		(char)(*p)[81];
		String q;
		int max;
		int min;
		int count;
		int[] b = new int[50];
		int i;
		int l;
		int s;
		for (p = a,count = 0;;p++,count++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p = tempVar;
			}
			if (System.in.read() == '\n')
			{
				break;
			}
		}
		count = count + 1;
		for (p = a,i = 0;p < a + count;p++,i++)
		{
			b[i] = p.length();
		}
		for (i = 0,max = b[0],min = b[0],l = 0,s = 0;i < count;i++)
		{
			if (max < b[i])
			{
				max = b[i];
				l = i;
			}
			if (min > b[i])
			{
				min = b[i];
				s = i;
			}
		}
		for (p = a;p < a + count;p++)
		{
			if (p == a + l)
			{
				System.out.println(p);
				break;
			}
		}
		for (p = a;p < a + count;p++)
		{
			if (p == a + s)
			{
				System.out.println(p);
				break;
			}
		}
	}

}

