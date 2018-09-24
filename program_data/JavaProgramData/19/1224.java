package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s;
		String a;
		String b;
		String p;
		String[] w = new String[100];
		int i;
		int j;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		b = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		for (i = 0;i < 100;i++)
		{
			s = '\0';
			a = '\0';
			b = '\0';
		}
		s = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		w[0] = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		for (j = 0;j < 100;j++)
		{
			*(w[0] + j) = '\0';
		}
		i = 0;
		j = 0;
		for (p = s; p != '\0';p++)
		{
			if (p != ' ')
			{
				*(w[i] + j) = p;
				j++;
			}
			else
			{
				i++;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				w[i] = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
				for (j = 0;j < 100;j++)
				{
					*(w[i] + j) = '\0';
				}
				j = 0;
			}
		}
		k = i;
		for (i = 0;i < k;i++)
		{
			if (strcmp(w[i],a) == 0)
			{
				w[i] = b;
			}
			for (j = 0; * (w[i] + j) != '\0';j++)
			{
				System.out.printf("%c",*(w[i] + j));
			}
			System.out.print(" ");
		}
		if (strcmp(w[k],a) == 0)
		{
			w[k] = b;
		}
		for (j = 0; * (w[k] + j) != '\0';j++)
		{
			System.out.printf("%c",*(w[k] + j));
		}
		System.out.print("\n");
	}
}

