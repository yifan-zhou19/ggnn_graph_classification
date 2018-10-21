package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c;
		String[] s;
		String[] h;
		char d;
	  int i = 0;
	  int n;
	  int j = 0;
	  int w = 1;
	  int a = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b;
	  int b;
	  int t = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
	  b = (int)calloc(26,(Integer.SIZE / Byte.SIZE));
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
	  h = s = (String)calloc(n,sizeof(String));
	  for (i = 0;i < n;i++)
	  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
	  c = (String)calloc(100,(Character.SIZE / Byte.SIZE));
	  c = new Scanner(System.in).nextLine();
	  s[i] = c;

	  }

	  for (i = 0;i < n;i++)
	  {
		  for (w = 0;w < 26;w++)
		  {
			  *(b + w) = 0;
		  }
		for (j = 0,d = (s[i] + j); * (s[i] + j) != '\0';j++)
		{
			d = (s[i] + j);
		  *(b + (d - 97)) = *(b + d - 97) + 1;
		}
		t = 0;
		for (j = 0,d = (s[i] + j); * (s[i] + j) != '\0';j++)
		{
			d = (s[i] + j);
		   w = (b + (d - 97));
		   if (w == 1)
		   {
			   System.out.printf("%c",d);
			   t = 1;
			   break;
		   }
		}
		if (t == 0)
		{
			System.out.print("no");
		}
		if (i != n - 1)
		{
			System.out.print("\n");
		}
	  }
	}
}

