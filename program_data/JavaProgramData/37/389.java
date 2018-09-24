package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int flag;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a;
		int a;
		String s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (int)malloc(200 * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
		s = new Scanner(System.in).nextLine();
		for (i = 1;i <= n;i++)
		{
			flag = 0;
			  for (k = 'a';k <= 'z';k++)
			  {
					*(a + k) = 0;
			  }
		s = new Scanner(System.in).nextLine();
		for (j = 0; * (s.Substring(j)) != '\0';j++)
		{
			*(a + *(s.Substring(j))) = *(a + *(s.Substring(j))) + 1;
		}
		for (j = 0; * (s.Substring(j)) != '\0';j++)
		{
			if (*(a + *(s.Substring(j))) == 1)
			{
			System.out.printf("%c\n",*(s.Substring(j)));
			flag = 1;
			break;
			}
		}
		if (flag == 0)
		{
			System.out.print("no\n");
		}
		}
	}
}

