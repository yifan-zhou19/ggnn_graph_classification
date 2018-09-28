package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		q = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		String str;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		str = (String)malloc(80 * (Character.SIZE / Byte.SIZE));
		str = new Scanner(System.in).nextLine();
		String[] p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		p = (String)malloc(n * sizeof(String));
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  p[i] = (String)malloc(80 * (Character.SIZE / Byte.SIZE));
		   p[i] = new Scanner(System.in).nextLine();
		   if ((p[i]) < 'A' || ((p[i])>'Z' && (p[i]) < 'a' && (p[i]) != '_') || (p[i])>'z')
		   {
			   *(q + i) = 0;
		   }
		   else
		   {
			   if (*(p[i] + 1) == '\0')
			   {
				   *(q + i) = 1;
			   }
			   for (j = 1;j < 81,*(p[i] + j) != '\0';j++)
			   {
				   s = 0;
				   if (*(p[i] + j) < '0' || (*(p[i] + j)>'9' && *(p[i] + j) < 'A') || (*(p[i] + j)>'Z' && *(p[i] + j) < 'a' && *(p[i] + j) != '_') || *(p[i] + j)>'z')
				   {
					  *(q + i) = 0;
					   break;
				   }
				   else
				   {
					   s++;
				   }
			   if (s > 0)
			   {
				   *(q + i) = 1;
			   }
			   else
			   {
				   *(q + i) = 0;
			   }
			   }
		   }
		}
		for (i = 0;i < (n - 1);i++)
		{
			System.out.printf("%d\n",*(q + i));
		}
		System.out.printf("%d",*(q + i));
	}



}

