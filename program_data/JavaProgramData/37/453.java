package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int k;
		  int num;
		  int f;
		  int wu;
		  int c;
		  String start;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }


		  String[] p = new String[n];
		  /*
		  ????????p[c]???? 
		  */

		  for (c = 0;c < n;c++)
		  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  p[c] = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  p[c] = tempVar2.charAt(0);
		  }
		  }
		  /*
		  ????n???? 
		  */

		  for (c = 0;c < n;c++)
		  {
		  num = String.valueOf(p[c]).length();
		  wu = 0;

		  /*
		  ?wu(?)?????????????? 
		  */

		  for (i = 0;i < num;i++)
		  {
							f = 0;
							for (j = 0;j < num;j++)
							{
													int temp;
													temp = p[c];
													if (*(p[c] + j) == *(p[c] + i))
													{
																	  f++;
													}
							}

							/*
							????p[c][i]??f???????
							*/ 

							if (f == 1)
							{
							System.out.printf("%c",*(p[c] + i));
							wu = 1;
							}
							/*
							?????????wu??1
							*/ 
							if (f == 1)
							{
							break;
							}
		  }
		  if (wu == 0)
		  {
		  System.out.print("no");
		  }
		  System.out.print("\n");
		  }
	}

}

