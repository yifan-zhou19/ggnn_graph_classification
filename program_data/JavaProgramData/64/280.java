package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct position
	//	{
	//		int x1;
	//	 int x2;
	//	 int x3;
	//	 }
	//	 pos[10];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct distance
	//	{
	//		int x;
	//	 int y;
	//	 float distan;
	//	 }
		 dis[60],temp; //x??????y??????distan???
		 int n;
		 int i;
		 int j;
		 int k;
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (i = 0;i < n;i++)
		 {
			   pos[i].x1 = ConsoleInput.readToWhiteSpace(true);
			pos[i].x2 = ConsoleInput.readToWhiteSpace(true);
			pos[i].x3 = ConsoleInput.readToWhiteSpace(true);
		 } //????
		 k = 0;
		 for (i = 0;i < n;i++)
		 {
			   for (j = i + 1;j < n;j++)
			   {
				  dis[k].x = i;
			   dis[k].y = j;
			   dis[k].distan = Math.sqrt((pos[i].x1 - pos[j].x1) * (pos[i].x1 - pos[j].x1) + (pos[i].x2 - pos[j].x2) * (pos[i].x2 - pos[j].x2) + (pos[i].x3 - pos[j].x3) * (pos[i].x3 - pos[j].x3));
			   k++;
			   } //????????????x,y,?????
		 }
		 for (i = 0;i < k;i++)
		 {
			   for (j = 0;j < k - 1 - i;j++)
			   {
				  if (dis[j].distan < dis[j + 1].distan)
				  {
					 temp = dis[j];
				  dis[j] = dis[j + 1];
				  dis[j + 1] = temp;
				  } //??????????????
			   }
		 }
		   for (i = 0;i < k;i++)
		   {
			 System.out.print("(");
			 System.out.print(pos[dis[i].x].x1);
			 System.out.print(",");
			 System.out.print(pos[dis[i].x].x2);
			 System.out.print(",");
			 System.out.print(pos[dis[i].x].x3);
			 System.out.print(")-(");
			 System.out.print(pos[dis[i].y].x1);
			 System.out.print(",");
			 System.out.print(pos[dis[i].y].x2);
			 System.out.print(",");
			 System.out.print(pos[dis[i].y].x3);
			 System.out.print(")=");
			 System.out.printf("%.2f", dis[i].distan);
			 System.out.printf("%.2f", "\n");
		   }
		   return 0;
	}
}

