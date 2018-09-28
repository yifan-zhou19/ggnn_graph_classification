package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *num;
		int num;
		String p;
		String p0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = p0 = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		num = (int)malloc(100 * (Integer.SIZE / Byte.SIZE));
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
				p = tempVar2.charAt(0);
			}
			k = 1;
			for (j = 1;j < 27;j++)
			{
				*(num + j) = 0;
			}
			for (p = p0,j = 0; * (p.Substring(j)) != '\0';j++)
			{
				t = (p.Substring(j)) - 96;
				*(num + t) = *(num + t) + 1;
			}
			for (p = p0,j = 0; * (p.Substring(j)) != '\0';j++)
			{
				t = (p.Substring(j)) - 96;
				if (*(num + t) == 1)
				{
					System.out.printf("%c%s",t + 96,i == n - 1?"":"\n");
					k = 0;
					break;
				}
			}
			if (k == 1)
			{
				System.out.printf("no%s",i == n - 1?"":"\n");
			}
		}
	}


}

