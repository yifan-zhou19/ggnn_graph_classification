public class tree
{
	public tree up;
	public int num;
}

package <missing>;

public class GlobalMembers
{
	public static tree MLC;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	public static tree * ptree = new tree();
	public static int[] a = new int[500];
	public static int[] b = new int[500];

	public static int Main()
	{
		int x;
		int y;
		int i = 1;
		int j;
		int p;
		int q;
		int miao;
		int woofoo = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		MLC = (tree)malloc(MAXNUM * sizeof(tree));
		for (ptree = MLC;ptree < MLC + 1000;ptree++)
		{
			ptree.num = i;
			//printf("%d\n",ptree->num);
			(ptree + i).up = ptree;
			(ptree + i + 1).up = ptree;
			i++;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: ptree=MLC;
		ptree.copyFrom(MLC);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: ptree=ptree+x-1;
		ptree.copyFrom(ptree + x - 1);
		i = 0;
		do
		{
			a[i] = ptree.num;
			//printf("%d\n",a[i]);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: ptree=ptree->up;
			ptree.copyFrom(ptree.up);
			i++;
		}while (a[i - 1] != 1);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: ptree=MLC+y-1;
		ptree.copyFrom(MLC + y - 1);
		j = 0;
		do
		{
			b[j] = ptree.num;
			//printf("%d\n",b[j]);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: ptree=ptree->up;
			ptree.copyFrom(ptree.up);
			j++;
		}while (b[j - 1] != 1);
		/*for(p=i;p>0;p--)
			printf("%d\n",a[p]);*/
		for (p = 0;p < i;p++)
		{
			miao = 0;
			for (q = 0;q < j;q++)
			{
				if (a[p] == b[q])
				{
					miao++;
					break;
				}
			}
			if (miao == 1)
			{
				System.out.printf("%d\n",a[p]);
				break;
			}
		}
		return 0;
	}
}

