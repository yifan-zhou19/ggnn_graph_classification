package <missing>;

public class GlobalMembers
{
	public static int[] s1 = new int[MAX];
	public static int[] s2 = new int[MAX];
	public static String num1 = new String(new char[MAX]);
	public static String num2 = new String(new char[MAX]);
	public static int Minus(int maxx, int[] s1, int[] s2)
	{
		int i;
		int largest = 0;
		for (i = 0;i < maxx;i++)
		{
			s1[i] -= s2[i];
			if (s1[i] < 0)
			{
				s1[i] += 10;
			s1[i + 1]--; //jiewei
			}
			if (s1[i] != 0)
			{
				largest = i;
			}
		}
		return largest;
	}

	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num1 = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num2 = tempVar3.charAt(0);
			}
			int i;
			int j;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(s1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(s2,0,(Integer.SIZE / Byte.SIZE));
			int n1 = num1.length();
			for (j = 0,i = n1 - 1;i >= 0;i--)
			{
				s1[j++] = num1.charAt(i) - '0';
			}
			int n2 = num2.length();
			for (j = 0,i = n2 - 1;i >= 0;i--)
			{
				s2[j++] = num2.charAt(i) - '0';
			}
			int largest = Minus(MAX, s1, s2);
			for (i = largest;i >= 0;i--)
			{
				System.out.printf("%d",s1[i]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

