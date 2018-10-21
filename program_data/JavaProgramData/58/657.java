package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int k;
	String[] p;
	char c;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	c = System.in.read();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
	p = (String)malloc(sizeof(String) * 1000);

	for (i = 0;i < n;i++)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (String)malloc((Character.SIZE / Byte.SIZE) * 80);
			p[i] = new Scanner(System.in).nextLine();
	}

	for (i = 0;i < n;i++)
	{
		j = 0;
		k = 0;
		if ((*(p[i] + k) == '_') || ((*(p[i] + k) <= 90) && (*(p[i] + k) >= 65)) || ((*(p[i] + k) <= 122) && (*(p[i] + k) >= 97)))
		{
			do
			{
				if ((*(p[i] + k) == '_') || ((*(p[i] + k) >= 48) && (*(p[i] + k) <= 57)) || ((*(p[i] + k) <= 90) && (*(p[i] + k) >= 65)) || ((*(p[i] + k) <= 122) && (*(p[i] + k) >= 97)))
				{
					j = 1;
				}
				else
				{
					j = 0;
					break;
				}
				k++;
				if (j == 0)
				{
					break;
				}
			} while (*(p[i] + k) != '\0');
		}
		System.out.printf("%d\n",j);
	}
	return 0;
	}
}

