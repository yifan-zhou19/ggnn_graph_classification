package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int n;
		int t;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a;
		int a;
		String[] p = new String[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (int)malloc(26 * (Integer.SIZE / Byte.SIZE));
		for (i = 0;i < t;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (String)malloc(100000 * (Character.SIZE / Byte.SIZE));
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < t;i++)
		{
			for (k = 0;k < 26;k++)
			{
			*(a + k) = 0;
			}
			j = 0;
			n = 0;
			while (*(p[i] + j) != '\0')
			{
				*(a + (*(p[i] + j) - 97)) = *(a + (*(p[i] + j) - 97)) + 1;
				j++;
			}

			 for (j = 0; * (p[i] + j) != '\0';j++)
			 {
				if (*(a + (*(p[i] + j) - 97)) == 1)
				{
					System.out.printf("%c\n",*(p[i] + j));
					n = 1;
					break;
				}
			 }
			if (n == 0)
			{
				System.out.print("no\n");
			}
		}
	}
}

