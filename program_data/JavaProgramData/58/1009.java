package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int t = 0;
		String str = new String(new char[81]);
		String p = new String(new char[2]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		str = (char[81])malloc(n * (Character.SIZE / Byte.SIZE) * 81);
		for (i = 0;i < n;i++)
		{
			*(str.Substring(i)) = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			t = 0;
			if (**(str.Substring(i)) >= 'a' && **(str.Substring(i)) <= 'z' || **(str.Substring(i)) >= 'A' && **(str.Substring(i)) <= 'Z' || **(str.Substring(i)) == '_')
			{
				for (j = 1; * (*(str.Substring(i)) + j) != '\0';j++)
				{
					if (!(*(*(str.Substring(i)) + j) >= 'a' && *(*(str.Substring(i)) + j) <= 'z' || *(*(str.Substring(i)) + j) >= 'A' && *(*(str.Substring(i)) + j) <= 'Z' || *(*(str.Substring(i)) + j) == '_' || *(*(str.Substring(i)) + j) >= '0' && *(*(str.Substring(i)) + j) <= '9'))
					{
						System.out.print("0\n");
						t = 1;
						break;
					}
				}
				if (t == 0)
				{
					System.out.print("1\n");
				}
			}
			else
			{
				System.out.print("0\n");
			}
		}
	}
}

