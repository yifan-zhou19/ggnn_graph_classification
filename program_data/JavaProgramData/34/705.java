void Try(int);
int main()
{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	Try(n);
	System.out.print("End");
	System.out.print("\n");
	return 0;
}
void Try(int i)
{
	 while (i != 1)
	 {
			 if (i % 2 == 0)
			 {
				   System.out.print(i);
				   System.out.print("/2=");
				   System.out.print(i / 2);
				   System.out.print("\n");
				   i = i / 2;
			 }
			 else
			 {
				 System.out.print(i);
				 System.out.print("*3+1=");
				 System.out.print(i * 3 + 1);
				 System.out.print("\n");
				 i = i * 3 + 1;
			 }
	 }
}


