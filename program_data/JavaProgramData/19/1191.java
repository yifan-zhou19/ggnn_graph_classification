package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  /*char a[100][100];
	  int i;
	  for(i=0;;i++)
	  {
		  scanf("%s",a[i]);
		  if(getchar()=='\n')break;
	  }*/
		String[] p = new String[100];
		String a;
		String b;
		int i;
		int j;
		for (i = 0;;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (String)malloc(100);
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p[i] = tempVar.charAt(0);
			}
			if (System.in.read() == '\n')
			{
				break;
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (String)malloc(100);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		b = (String)malloc(100);
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		for (j = 0;j <= i;j++)
		{
			if (strcmp(p[j],a) == 0)
			{
				p[j] = b;
			}
		}
		for (j = 0;j < i;j++)
		{
			System.out.printf("%s ",p[j]);
		}
		System.out.printf("%s",p[i]);
	}
}

