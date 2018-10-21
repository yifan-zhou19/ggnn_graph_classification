package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int n;
		int t = 0;
		int m = 0;
		String str = new String(new char[100000]);
		String p = new String(new char[2]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		str = (char[100000])malloc(n * (Character.SIZE / Byte.SIZE) * 100000);
		for (i = 0;i < n;i++)
		{
			*(str.Substring(i)) = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			m = 0;
			for (j = 0; * (*(str.Substring(i)) + j) != '\0';j++)
			{
				for (k = 0; * (*(str.Substring(i)) + k) != '\0';k++)
				{
					if (*(*(str.Substring(i)) + j) == *(*(str.Substring(i)) + k) && j != k)
					{
						t = 1;
						break;
					}
				}
				if (t == 0)
				{
					System.out.printf("%c\n",*(*(str.Substring(i)) + j));
					m = 1;
					break;
				}
				t = 0;
			}
			if (m == 0)
			{
				System.out.print("no\n");
			}
		}
	}
}

