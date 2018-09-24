package <missing>;

public class GlobalMembers
{
	public static int trans(char k)
	{
		int i;
		char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		for (i = 0;i < 26;i++)
		{
			if (k == a[i])
			{
				return i;
			}
		}
	}
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct books
	//	{
	//		int n;
	//		char w[27];
	//	}
	//	*m;
		int num;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		m = (books)malloc(sizeof(books) * num);
		for (i = 0;i < num;i++)
		{

			int N;
			String W = new String(new char[27]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				N = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				W = tempVar3.charAt(0);
			}
			m[i].n = N;
			m[i].w = W;
		}
		int[] b = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int c;
		for (i = 0;i < num;i++)
		{
			for (j = 0;m[i].w[j] != '\0';j++)
			{
				c = trans(m[i].w[j]);
				b[c]++;
			}
		}
		int max = 0;
		char most;
		for (i = 0;i < 26;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
				most = 'A' + i;
			}
		}
		System.out.printf("%c\n%d\n",most,max);
		for (i = 0;i < num;i++)
		{
			for (j = 0;m[i].w[j] != '\0';j++)
			{
				if (m[i].w[j] == most)
				{
					System.out.printf("%d\n",m[i].n);
				}
			}
		}
		return 0;
	}

}

