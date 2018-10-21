package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //flag???????//
		int l;
		int j;
		int i;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		String[] p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		p = (String)malloc(n * sizeof(String));
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (String)malloc(80 * (Character.SIZE / Byte.SIZE));
			p[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			l = String.valueOf(p[i]).length();
			if (p[i] == '_' || ((p[i]) >= 'a' && p[i] <= 'z') || (p[i] >= 'A' && p[i] <= 'Z'))
			{
			  for (j = 0;j < l;j++)
			  {
					if (*(p[i] + j) == '_' || (*(p[i] + j) >= 'a' && *(p[i] + j) <= 'z') || (*(p[i] + j) >= 'A' && *(p[i] + j) <= 'Z') || (*(p[i] + j) >= '0' && *(p[i] + j) <= '9'))
					{
						flag = 0;
					}
					else
					{
						flag = 1;
						break; //???????????????????//
					}
			  }
			}
			else
			{
				flag = 1;
			}
			if (flag == 0)
			{
				System.out.printf("%d\n",1);
			}
			else
			{
				System.out.printf("%d\n",0);
			}
		}
		return 0;
	}
}

