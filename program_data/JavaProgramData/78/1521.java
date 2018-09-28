package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] s = new int[4]; //s[4]????????s[0]s[1]s[2]s[3]???Z,Q,S,L???
	   for (s[0] = 10;s[0] <= 50;s[0] = s[0] + 10)
	   {
		   for (s[1] = 10;s[1] <= 50;s[1] = s[1] + 10)
		   {
					 for (s[2] = 10;s[2] <= 50;s[2] = s[2] + 10)
					 {
								  for (s[3] = 10;s[3] <= 50;s[3] = s[3] + 10)
								  {
											if ((s[0] + s[1] == s[2] + s[3]) && (s[0] + s[3] > s[2] + s[1]) && (s[0] + s[2] < s[1]))
											{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
											goto loop;
											}
								  }
					 }
		   }
	   }
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	{
		  if (s[0] == 50)
		  {
		  System.out.print("z ");
		  System.out.print(s[0]);
		  System.out.print("\n");
		  }
		  if (s[1] == 50)
		  {
		  System.out.print("q ");
		  System.out.print(s[1]);
		  System.out.print("\n");
		  }
		  if (s[2] == 50)
		  {
		  System.out.print("s ");
		  System.out.print(s[2]);
		  System.out.print("\n");
		  }
		  if (s[3] == 50)
		  {
		  System.out.print("l ");
		  System.out.print(s[3]);
		  System.out.print("\n");
		  }
		  if (s[0] == 40)
		  {
		  System.out.print("z ");
		  System.out.print(s[0]);
		  System.out.print("\n");
		  }
		  if (s[1] == 40)
		  {
		  System.out.print("q ");
		  System.out.print(s[1]);
		  System.out.print("\n");
		  }
		  if (s[2] == 40)
		  {
		  System.out.print("s ");
		  System.out.print(s[2]);
		  System.out.print("\n");
		  }
		  if (s[3] == 40)
		  {
		  System.out.print("l ");
		  System.out.print(s[3]);
		  System.out.print("\n");
		  }
		  if (s[0] == 30)
		  {
		  System.out.print("z ");
		  System.out.print(s[0]);
		  System.out.print("\n");
		  }
		  if (s[1] == 30)
		  {
		  System.out.print("q ");
		  System.out.print(s[1]);
		  System.out.print("\n");
		  }
		  if (s[2] == 30)
		  {
		  System.out.print("s ");
		  System.out.print(s[2]);
		  System.out.print("\n");
		  }
		  if (s[3] == 30)
		  {
		  System.out.print("l ");
		  System.out.print(s[3]);
		  System.out.print("\n");
		  }
		  if (s[0] == 20)
		  {
		  System.out.print("z ");
		  System.out.print(s[0]);
		  System.out.print("\n");
		  }
		  if (s[1] == 20)
		  {
		  System.out.print("q ");
		  System.out.print(s[1]);
		  System.out.print("\n");
		  }
		  if (s[2] == 20)
		  {
		  System.out.print("s ");
		  System.out.print(s[2]);
		  System.out.print("\n");
		  }
		  if (s[3] == 20)
		  {
		  System.out.print("l ");
		  System.out.print(s[3]);
		  System.out.print("\n");
		  }
		  if (s[0] == 10)
		  {
		  System.out.print("z ");
		  System.out.print(s[0]);
		  System.out.print("\n");
		  }
		  if (s[1] == 10)
		  {
		  System.out.print("q ");
		  System.out.print(s[1]);
		  System.out.print("\n");
		  }
		  if (s[2] == 10)
		  {
		  System.out.print("s ");
		  System.out.print(s[2]);
		  System.out.print("\n");
		  }
		  if (s[3] == 10)
		  {
		  System.out.print("l ");
		  System.out.print(s[3]);
		  System.out.print("\n");
		  }
	}
	return 0;
	}
}
