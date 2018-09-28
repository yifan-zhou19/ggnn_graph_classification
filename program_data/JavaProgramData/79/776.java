package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] n = new int[100];
		int[] m = new int[100];
		int i;
		int j;
		int y;
		int x;

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct monkey
	//	{
	//		int num;
	//		struct monkey *next;
	//	};
		monkey[] mon = tangible.Arrays.initializeWithDefaultmonkeyInstances(300);
		monkey head;
		monkey p;
		int k = -1;
			do
			{
				k++;
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  n[k] = Integer.parseInt(tempVar);
			  }
			  String tempVar2 = ConsoleInput.scanfRead(" ");
			  if (tempVar2 != null)
			  {
				  m[k] = Integer.parseInt(tempVar2);
			  }

			} while (n[k] != 0);
			for (i = 0;i < k;i++)
			{
				for (j = 0;j < n[i];j++)
				{
				mon[j].num = j + 1;
				mon[j].next = mon[j + 1];
				}
				mon[n[i] - 1].next = mon[0];
				head = mon[n[i] - 1];
				 while ((head.next) != head)
				 {
					x = 1;
					while (x < m[i])
					{

						head = head.next;
						x++;
					}

					head.next = (head.next).next;
				 }
			  System.out.printf("%d\n",head.num);
			}
	}


}

