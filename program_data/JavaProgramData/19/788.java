package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String p;
		String a;
		String b;
		String t1;
		String t2;
		String t3;
		int i;
		int j;
		int k;
		int r;
		int n0;
		int n1;
		int n2;
		int n;
		int m;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(200 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		b = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		t1 = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		t2 = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		t3 = (String)malloc(300 * (Character.SIZE / Byte.SIZE));

		p = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		n = p.length();
		//strcpy(t1," ");
		m = 0;
		for (i = 0,k = 0;i < n;i++)
		{
			//printf("i=%d\n",i);
			r = 0;
			if ((*(p.Substring(i)) == ' ') || (i == 0))
			{
				r = 1;
				if (i != 0)
				{
					n1 = i + 1;
				}
				else
				{
					n1 = i;
				}
			}
			//printf("%d %d\n",r,n1);
			if (r == 1)
			{
				for (i = n1, j = 0;(*(p.Substring(i)) != ' ') && (*(p.Substring(i)) != '\0');i++, j++)
				{
					*(t1.Substring(j)) = *(p.Substring(i));
				}
				i = i - 1;

				*(t1.Substring(j)) = '\0';

			}
			//puts(t1);
			n2 = i + 1;
			if (strcmp(t1,a) == 0)
			{
				if (n2 != n)
				{
					System.out.printf("%s ",b);
				}
				else
				{
					System.out.printf("%s",b);
				}
				m = 1;

			}
			else
			{
				if (n2 != n)
				{
					System.out.printf("%s ",t1);
				}
				else
				{
					System.out.printf("%s",t1);
				}
				t1 = " ";
			}

		}

	}


}
