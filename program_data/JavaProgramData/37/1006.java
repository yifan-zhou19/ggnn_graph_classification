package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int b;
		int c;
		char a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *s=(char *)malloc(sizeof(char)*100000);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		char s = (String)malloc((Character.SIZE / Byte.SIZE) * 100000);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			l = s.length();
			c = 0;
			for (j = 0;j < l;j++)
			{
				a = (s + j);
				b = 0;
				for (k = 0;k < l;k++)
				{
					if (k != j && *(s + k) == a)
					{
						b++;
						break;
					}
				}
				if (b == 0)
				{
					System.out.printf("%c\n",a);
					c++;
					break;
				}
			}
			if (c == 0)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

