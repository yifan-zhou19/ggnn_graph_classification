package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q,n,i,j=0,max=0,min=100,k,l=0;
		int q;
		int n;
		int i;
		int j = 0;
		int max = 0;
		int min = 100;
		int k;
		int l = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		q = (int)malloc(50 * (Integer.SIZE / Byte.SIZE));
		for (i = 0;i < 50;i++)
		{
			*(q + i) = 0;
		}
		p = new Scanner(System.in).nextLine();
		n = p.length();
		for (i = 0;i < n;i++)
		{
			if (*(p.Substring(i)) != 32)
			{
				(*(q + j))++;
			}
			else
			{
				j++;
				*(p.Substring(i)) = 0;
			}
		}
		for (i = 0;i <= j;i++)
		{
			if (max < *(q + i))
			{
				max = (q + i);
			}
		if (min > *(q + i))
		{
			min = (q + i);
		}
		}
		for (i = 0;i <= j;i++)
		{
			if (max == *(q + i))
			{
				break;
			}
		}
		for (k = 0;k < n;k++)
		{
			if (i == l)
			{
				break;
			}
		if (*(p.Substring(k)) == 0)
		{
			l++;
		}
		}
		System.out.printf("%s\n",p.Substring(k));
			 l = 0;
		for (i = 0;i <= j;i++)
		{
			if (min == *(q + i))
			{
				break;
			}
		}
		for (k = 0;k < n;k++)
		{
			if (i == l)
			{
				break;
			}
		if (*(p.Substring(k)) == 0)
		{
			l++;
		}
		}
		System.out.printf("%s",p.Substring(k));


	}
}
