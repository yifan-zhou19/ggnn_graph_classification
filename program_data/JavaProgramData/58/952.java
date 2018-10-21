package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int n;
		  int flag = 1;
		  String[] p;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		  p = (String)malloc(n * sizeof(String));
		  for (i = 0;i < n;i++)
		  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			   p[i] = (String)malloc(81 * (Character.SIZE / Byte.SIZE));
		  }
		  for (i = 0;i < n;i++)
		  {
			   p[i] = new Scanner(System.in).nextLine();
		  }
		  for (i = 0;i < n;i++)
		  {
			   if (!(p[i][0] == '_' || (p[i][0] >= 'a' && p[i][0] <= 'z') || (p[i][0] >= 'A' && p[i][0] <= 'Z')))
			   {
						   flag = 0;
			   }
			   for (j = 0;p[i][j] != '\0';j++)
			   {
					if (!((p[i][j] >= '0' && p[i][j] <= '9') || (p[i][j] >= 'a' && p[i][j] <= 'z') || (p[i][j] <= 'Z' && p[i][j] >= 'A') || (p[i][j] == '_')))
					{
						   flag = 0;
					}
			   }
			   System.out.printf("%d\n",flag);
			   flag = 1;
		  }
		  for (i = 0;i < n;i++)
		  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			   free(p[i]);
		  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		  free(p);

	}

}

