package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int l;
		int t;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		System.in.read();
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p=(int*)malloc(26 *sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		int p = (int)malloc(26 * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *s1=(char*)malloc(26 *sizeof(char));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		char s1 = (String)malloc(26 * (Character.SIZE / Byte.SIZE));
		String s = new String(new char[100000]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		s = (char[100000])calloc(t,100000 * (Character.SIZE / Byte.SIZE));
		for (i = 0;i < t;i++)
		{
		   *(s.Substring(i)) = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < t;i++)
		{
			for (j = 0;j < 26;j++)
			{
				*(p + j) = 0;
			}
			k = 0;
			m = 0;
			for (j = 0; * (*(s.Substring(i)) + j) != '\0';j++)
			{
			 (*(p + (int)(*(*(s.Substring(i)) + j)) - 97))++;
			}
			for (j = 0;j < 26;j++)
			{
			if (*(p + j) == 1)
			{
				 *(s1 + k) = (char)(j + 97);
				 k++;
				 m = 1;
			}
			}
			if (m == 0)
			{
				System.out.print("no\n");
			}
			else if (m == 1)
			{
				for (j = 0; * (*(s.Substring(i)) + j) != '\0';j++)
				{
					 for (l = 0;l < k;l++)
					 {
					 if ((int)(*(*(s.Substring(i)) + j)) == (int)(*(s1 + l)))
					 {
						 System.out.printf("%c\n",*(s1 + l));
						 m = 0;
						 break;
					 }
					 }
					 if (m == 0)
					 {
						 break;
					 }
				}
			}
		}
	}
}

