package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 int i;
		 int j;
		 int k = 0;
		 int m = 0;
		 int n;
		String p;
		(char)(*q)[100];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		q = (char [100])malloc(100 * 100 * (Character.SIZE / Byte.SIZE));

		for (i = 0;i < 100;i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				p.Substring(i) = Integer.parseInt(tempVar);
			}
		}
		for (j = 0; * (p.Substring(j)) != '\0';j++)
		{
			if (*(p.Substring(j)) != ' ' && *(p.Substring(j) - 1) != ' ')
			{
				*(*(q + k) + m) = *(p.Substring(j));
				m++;
			}
			if (*(p.Substring(j)) != ' ' && *(p.Substring(j) - 1) == ' ')
			{
				*(*(q + k) + m) = '\0';
				k++;
				m = 0;
							   *(*(q + k) + m) = *(p.Substring(j));
							   m++;

			}
		}
		for (n = 0;n <= k;n++)
		{
			System.out.printf("%s ",*(q + n));
		}
	}

}

