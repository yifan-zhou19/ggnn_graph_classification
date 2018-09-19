public class Student
{
	   public int num;
	   public int chinese;
	   public int maths;
}
 public class qiansan
 {
			 public int num;
			 public int zongfen;
 }

package <missing>;

public class GlobalMembers
{
		  public static qiansan[] st =
		  {
			  new qiansan(0, 0),
			  new qiansan(0, 0),
			  new qiansan(0, 0)
		  };
	public static int Main()
	{
		  int n;
		  int i;
		  int k;
		  int[] c = new int[10];
		  int[] j = new int[10];
		  int[] a = new int[100001];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  Student[] std = tangible.Arrays.initializeWithDefaultStudentInstances(100001);
		  for (i = 0;i < n;i++)
		  {
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					std[i].num = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					std[i].chinese = Integer.parseInt(tempVar3);
				}
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					std[i].maths = Integer.parseInt(tempVar4);
				}
		  }
		  for (i = 0;i < n;i++)
		  {
				a[i] = std[i].chinese + std[i].maths;
		  }
		  for (i = 0;i < n;i++)
		  {
			  if (a[i] > st[0].zongfen)
			  {
				  st[2] = st[1];
				  st[1] = st[0];
				  st[0].zongfen = a[i];
				  st[0].num = std[i].num;
			  }
			  else if (a[i] <= st[0].zongfen != 0 && a[i] > st[1].zongfen)
			  {
				  st[2] = st[1];
				  st[1].zongfen = a[i];
				  st[1].num = std[i].num;
			  }
			  else if (a[i] <= st[1].zongfen != 0 && a[i]> st[2].zongfen)
			  {
				  st[2].zongfen = a[i];
				  st[2].num = std[i].num;
			  }
		  }
		  for (i = 0;i < 3;i++)
		  {
			  System.out.printf("%d %d\n",st[i].num,st[i].zongfen);
		  }
		  System.in.read();
		  System.in.read();

	}

}

