package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a;
		String b;
		String t;
		int i;
		int j;
		int n;
		int max = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		a = (String)calloc(1,12);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		b = (String)calloc(1,5);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		t = (String)calloc(1,20);
		for (;scanf("%s %s",a,b) != EOF;)
		{
			for (i = 0;i < (n = a.length());i++)
			{
				if (*(a.Substring(i)) > max)
				{
					max = (a.Substring(i));
				}
			}
			for (i = 0;i < (n = a.length());i++)
			{
				if (*(a.Substring(i)) == max)
				{
					break;
				}
			}
			strncat(t,a,i + 1);
			t += b;
			t += a.Substring(i) + 1;
			System.out.printf("%s\n",t);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
			a = (String)calloc(1,12);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
			b = (String)calloc(1,5);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
			t = (String)calloc(1,20);
			max = 0;
		}
	}
}
