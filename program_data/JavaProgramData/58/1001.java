package <missing>;

public class GlobalMembers
{
	/*??,???????????????*/

	public static int Main()
	{
		  String k;
		  int n;
		  int num;
		  int i;
		  int pd;
		  int j;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		  int q;
		  String[] p = new String[n];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  k = (String)malloc(81 * (Character.SIZE / Byte.SIZE));
		  k = new Scanner(System.in).nextLine();
		  p[0] = k;
		  for (i = 1;i < n + 1;i++)
		  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
						k = (String)malloc(81 * (Character.SIZE / Byte.SIZE));
						k = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
						p[i] = (String)malloc(81 * (Character.SIZE / Byte.SIZE));
						p[i] = k;
		  }

		  for (i = 1;i < n + 1;i++)
		  {
						num = String.valueOf(p[i]).length();
						if (p[i] == '_' || Character.isLetter(p[i]))
						{
						pd = 1;
						}
						else
						{
						pd = 0;
						}

						p[i]++;

						for (j = 1;j < num;j++)
						{

							   if (Character.isLetterOrDigit(p[i]))
							   {
							   p[i]++;
							   }
							   else if (p[i] == '_')
							   {
							   p[i]++;
							   }
							   else
							   {
								   pd = 0;
								   break;
							   }

						}
		  System.out.printf("%d\n",pd);
		  }


	}



}

