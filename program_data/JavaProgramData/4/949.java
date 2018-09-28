package <missing>;

public class GlobalMembers
{
	/*
	  Name: ?????????? 
	  Copyright: 
	  Author: 
	  Date: 09/12/12 22:42
	  Description: ????row?col??????array????array[0][0]????????????????????????? 
	*/
	public static int Main()
	{
		int row;
		int col;
	   int time = 0;
	   row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   int[][] array = new int[110][110];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	   int * p = null;
	   int i;
	   int j;
	   int k;
	   for (i = 0 ; i < row ; i++)
	   {
		   for (p = (array + i);p < *(array + i) + col;p++)
		   {
			  *p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   }
	   }
		  //    for( i = 0 ; i < row ; i++) 
	//       for( j = 0 ; j < col ; j++)
	//       cout<<array[i][j]<<endl; 
	   for (k = 0;k <= col + row;k++)
	   {
		   for (i = 0;i < row;i++)
		   {
			  for (j = 0,p = (array + i);p < *(array + i) + col;j++,p++)
			  {
			 if (i + j == k && *p != 0)
			 {
			  System.out.print(p);
			  System.out.print("\n");
			 }

			  }
		   }
	   }

		return 0;
	}

}

