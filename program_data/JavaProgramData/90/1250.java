int put = new int(int,int);
int main()
{
	int apple;
	int plate;
	int n;
	int sum = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0;i < n;i++)
	{
		apple = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		plate = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(put(apple,plate));
		System.out.print("\n");
	}
	return 0;
}

int put(int apple,int plate)
{
   if (plate == 1 || apple == 1)
   {
	   return 1;
   }
   if (apple < plate)
   {
	   return put(apple,apple);
   }
   if (apple == plate)
   {
	   return put(apple,plate-1) + 1;
   }
   return put(apple - plate,plate) + put(apple,plate-1);
}


